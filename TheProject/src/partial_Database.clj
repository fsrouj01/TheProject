(ns partial_Database)
;(:require clojure.contrib.sql)

;=======================================================================
; Manage the database
;=======================================================================

(defn create-table 
  [table-name specs]
  (eval(read-string (str "(def " table-name "(ref #{}))")))
  (eval(read-string (str "(dosync (alter " table-name " conj " specs "))"))))



  
(defn create-database 
  [databasa-name specs-and-tables-names]
  (eval(read-string (str "(def " databasa-name " (ref #{}))")))
  (let [tables-names (keys specs-and-tables-names)
       specs (vals specs-and-tables-names )] 
      (eval(read-string 
         (str "(dosync (alter "  databasa-name " conj (create-table (tables-names specs))))")))))




  (def sp {"mykey" {"name" "" "composer" "" "language" ""}})
  (create-database "yoyo" sp)


  
  
  
  
  (eval(read-string 
         (str "(dosync (alter "  databasa-name " conj (create-table (tables-names specs))))")))


  
  

 (eval(read-string (str "(def " "yoyo" " (ref #{}))")))
   (let [tables-names (keys sp)
       specs (vals sp)] 
  (eval(read-string 
         (str "(dosync (alter "  "yoyo" " conj (create-table ((first (tables-names)) (first(specs))))))"))))


 
 
   
  (comment
 ( read-string   ("faddfas"))
 
 
 
 
 
 
 
     (let [tables-names (keys sp)
       specs (vals sp) ] 
  (eval( (read-string (str "(dosync (alter " "yoyo" " conj (create-table"  "("))
        (first tables-names)
        (first (vals sp)) 
        (read-string '("))))")))))
     
     
  (def tables-names(keys sp))
  @tables-names
  
  
  
  
  
(defn drop-database [db-name])

(defn use-database [db-name])

(dosync (alter dataBase conj compositions))

;=======================================================================
; CRUD - create, read, update, delete - table
;=======================================================================

(defn create-table 
  [table-name specs]
  (eval(read-string (str "(def " table-name "(ref #{}))")))
  (eval(read-string (str "(dosync (alter " table-name " conj " specs "))"))))

(defn read-table
  [table-name]
  (@table-name))


;=======================================================================
; Change in an existing table
;=======================================================================

(defn table-add-col [table-name col]
  (cons table-name col)
  (assoc serializable-stu :state "NC"))

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
(defn intersection-tables )

;; select columns
(defn select )

;; where rows
(defn where )

;; from tables. cartesian multiplication on tables
(defn from )

;; join two tables
(defn join )
 

;=======================================================================
; Print the database
;=======================================================================

(use 'clojure.pprint 'clojure.reflect) ; this is from clojure/pprint/print_table.clj:11
;(use 'clojure.pprint); this is from clojure/pprint/print_table.clj:11
(defn printer-one-table [tbl]
(print-table @tbl) )

;^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
; The end
;^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
)



            
