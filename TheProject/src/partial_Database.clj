(ns partial-Database
  (:require clojure.lang.ISeq.))
;(:require clojure.contrib.sql)

;;;;;;;; draft file ;;;;;;;;;

;=======================================================================
; Manage the database
;=======================================================================

(defn #^set create-database #^set[db-name tables-names]
  "Returns a database constructed from the tables inputed"
  (def db-name (ref #{})))
(if) 
(defn drop-database [db-name])

(defn use-database [db-name])

(dosync (alter dataBase conj compositions))

;=======================================================================
; Create a ?
;=======================================================================
 
(def tables (ref #{}))

(dosync & db); Use ref to create a reference, and use def to bind this reference to the name tables
        
(db (alter tables conj "Stu"))

;=======================================================================
; To make a reference to the table ?
;=======================================================================

(def tables (ref #{}))
@ tables     
(dosync (alter tables conj "Stu"))
@tables
     
;=======================================================================
; Functional dependencies inside the table        
;=======================================================================
       
(let [])

;=======================================================================
; CRUD - create, read, update, delete - table
;=======================================================================

(defn create-table [table-name]
  "creates an empty table"
  (def table-name  )
  )

;=======================================================================
; Change in an existing table
;=======================================================================

(defn table-add-col [table-name col]
  (cons table-name col))

(defn table-add-cols [table-name cols]
  apple(cons table-name col))

(defn table-add-row [table-name col]
  (cons table-name col))

(defn table-add-rows [table-name col]
  (cons table-name col))

(defn drop-table [table-name att]
  (alter r update-fn & args))

(assoc nations :state "NC")

;;; Domain constraints
;; Value inserted to the database must come appropriate field

(defn create-domain [domain])
(defn constrain [chech])

;=======================================================================
; Some SQL oerations 
;=======================================================================

;; Union two tables
(defn union-tables [table1 table2] (conj table1 table2)) 

;; difference two tables
(defn difference-tables composers nations)

;; intersection two tables
(defn intersection-tables languages beverages)

;; select columns
(defn select #(= 1 (.length %)) languages)

;; where rows
(defn where #(= 1 (.length %)) languages)

;; from tables. cartesian multiplication on tables
(defn from #(= 1 (.length %)) languages)

;; join two tables
(defn join compositions composers)
 
;=======================================================================
; Get table as a string for printing
;=======================================================================

(defn #^Set get-str-table [#^String c]); expects a set and returns a string. #^String = #^{:tag String}
(defn #^{:tag String} shout [#^{:tag String} s] (.toUpperCase s))
(shout "")

;=======================================================================
; Print the database
;=======================================================================

(use 'clojure.pprint 'clojure.reflect) ; this is from clojure/pprint/print_table.clj:11
;(use 'clojure.pprint); this is from clojure/pprint/print_table.clj:11
(defn printer-one-table [tbl]
(print-table @tbl) )








            
