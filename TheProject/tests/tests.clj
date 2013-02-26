(ns tests
  ;Tests for partial-Database as a whole
  (:use partial_Database); copy all symbols from the partial-Database ns
  
)

;(:require clojure.contrib.sql)
; :use java.util.Formatter.format
; (:import (java.io File))

;-----------------------------------------------------------------------  
; Testing DDL operations 
;-----------------------------------------------------------------------  



(def specs {:name "" :composer "" :language ""})

(create-table "nations" "specs")

(read-table nations)

;-----------------------------------------------------------------------  
; Testing SQL operations 
;-----------------------------------------------------------------------  




;-----------------------------------------------------------------------  
; Relational algebra tests
;-----------------------------------------------------------------------  






