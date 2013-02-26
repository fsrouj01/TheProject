(ns partial_Database)
;(:require clojure.contrib.sql)

;=======================================================================
; CRUD - create, read, update, delete - table
;=======================================================================

(defn create-table 
  "create a new table called as in [table-name]
   based on the specs. And be able to expand it." 
  [table-name specs]
  (eval(read-string (str "(def " table-name "(ref #{}))")))
  (eval(read-string (str "(dosync (alter " table-name " conj " specs "))"))))

(defn read-table
  "read the table"
  [table-name]
  (@table-name))

(defn update-table
  "update the table"
  [table-name]
  ())

(defn delete-table
  "delete the table"
  [table-name]) 

;=======================================================================
; Manage the database
;=======================================================================

(defn create-database 
  "this implementaion may be expanded to more than one table by 
   operating the same operations here to all the tables that are 
   included in the database." 
  [specs-and-tables-names table-num];can be done without the number of the tables
  (def thedb (ref []))
  (loop [result [] x table-num] 
    (if (zero? x);if all the tables are in, finish.
   ; ((print "Database is done and all tables in")
       (dosync (alter thedb conj result))
    (recur
  (let [tables-names (get specs-and-tables-names (eval(read-string (format ":table-name%s" x))));takes the i'th name
        specs        (get specs-and-tables-names (eval(read-string (format ":table-specs%s" x))))];takes the i'th specs
   (conj result (create-table tables-names specs)))(dec x));create each table
  ))
  )
    
(print result)

(def sp {:table-name1 "firstTable" 
         :table-specs1 {:name "" :composer "" :language ""} 
         :table-name2 "secondTable" 
         :table-specs2 {:name "" :composer "" :language ""}})

(create-database sp 5)

(defn drop-database [db-name])

(defn use-database [db-name])

(dosync (alter dataBase conj compositions))

;=======================================================================
; Change in an existing table
;=======================================================================
(comment
;==================== Add operations =================================

(defn add-col 
  "add one column to the table"
  [table-name col] 
  (cons table-name col)
  (assoc serializable-stu col))

(defn add-cols
  "add one more than one colums to the table"
  [table-name cols] 
  apple(add-col ))

(defn  add-row [table-name col]
  "add one row to the table" 
  ((assoc nations :state "NC") ))

(defn  add-rows [table-name col]
  "add more than one row to the table"
  (cons add-row))

;==================== Delete operations =================================

(defn delete-col 
  "delete one column to the table"
  [table-name col] 
  (cons table-name col)
  (assoc serializable-stu col))

(defn delete-cols
  "delete one more than one colums to the table"
  [table-name cols] 
  apple(delete-col ))

(defn delete-row [table-name col]
  "delete one row to the table" 
  ((dissoc nations :state "NC") ))

(defn delete-rows [table-name col]
  "delete more than one row to the table"
  (cons delete-row))

(defn create-domain [domain])
(defn constrain [chech])
)
;=======================================================================
; Some SQL oerations 
;=======================================================================
(comment
  
;; Union two tables
(defn union-tables [table1 table2] (conj table1 table2)) 

;; difference two tables
(defn difference-tables composers nations)

;; intersection two tables
(defn intersection-tables )

;; select columns
(defn select )

;; where rows
(defn where )

;; from tables. cartesian multiplication on tables
(defn from )

;; join two tables
(defn join )

)
;=======================================================================
; Print the database - important
;=======================================================================

(use 'clojure.pprint 'clojure.reflect) ; this is from clojure/pprint/print_table.clj:11
;(use 'clojure.pprint); this is from clojure/pprint/print_table.clj:11
(defn printer-one-table [tabel]
(print-table @tabel) )




; pritning to a txt file
(comment
(binding [*out* (clojure.java.io/writer "foo.txt")]
  (print "Hello World"))

(print "This does NOT go to the file") ;; outside the binding macro

(set! *out* (clojure.java.io/writer "foo.txt"))

(print "foo") ;; written to foo.txt
(print "bar") ;; written to foo.txt
;not sure if there will be any negative side-effects of re-setting this var. 
)

;^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
;                                The end
;^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^


;=============== possible extesions to the project =====================;
; Funcitonal dependencies
; 3NF BCNF algorithims
; Reading from txt files the DDL code. parsing may be here or in JAVA.
;=======================================================================            


