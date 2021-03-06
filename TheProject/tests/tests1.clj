(ns tests1
  ;Tests for partial-Database as a whole
  (:use partial_Database); copy all symbols from the partial-Database ns 
)

;(:require clojure.contrib.sql)
; :use java.util.Formatter.format
; (:import (java.io File))

;-----------------------------------------------------------------------  
; Equeipments for testing DDL operations 
;----------------------------------------------------------------------- 

;specs
(def sp {:table-name1 "firstTable" 
         :table-specs1 {:name "" :composer "" :language ""} 
         :table-name2 "secondTable" 
         :table-specs2 {:name "" :composer "" :language ""}})

;-----------------------------------------------------------------------  
; Testing DDL operations 
;-----------------------------------------------------------------------  

(def specs1 {:name "" :city "" :composer ""})
(def specs2 {:composer "" :country "" :language ""})
(def specs3 {:nation "" :language "" :language ""})

(read-table nations)
;-----------------------------------------------------------------------  
; Test the CRUD of persistent storage
;-----------------------------------------------------------------------  

;; The values used here in the tables should look like the tables in test2

(create-table "nations" "specs")
(create-table "composers" "specs")
(create-table "compositions" "specs")
 ( comment
(read-table "nations")

(update-table "nations")

(delete-table "nations")

;-----------------------------------------------------------------------  
; Testing SQL operations on the tables we are creating
;-----------------------------------------------------------------------  
 ;all is comment for possible work we could have done.
  
(union-tables [nations-made-before composers-made-befoe] )

(difference-tables [nations-made-before composers-made-befoe])

(intersection-tables )

;; select columns
(select [] )

where rows
(where [] )

;; from tables. cartesian multiplication on tables
(from [nations-made-before composers-made-befoe] )

;; join two tables
(join [nations-made-before composers-made-befoe])


;-----------------------------------------------------------------------  
; Relational algebra tests
;-----------------------------------------------------------------------  


;-----------------------------------------------------------------------  
; Printing !
;-----------------------------------------------------------------------  
;(use 'clojure.pprint 'clojure.reflect) ; this is from clojure/pprint/print_table.clj:11

(use 'clojure.pprint); this is from clojure/pprint/print_table.clj:11
(print-table composers-made-before) 
(print-table nations-made-before) 
(print-table compositions-made-before) 

)

