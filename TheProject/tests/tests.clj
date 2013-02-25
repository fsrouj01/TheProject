(ns tests
  "Tests for partial-Database as a whole"
  :use clojure.set
  :use java.util.Formatter.format
;   (:import (java.io File))
;   (:require clojure.contrib.sql)
)



;-----------------------------------------------------------------------  
; Three tables
;----------------------------------------------------------------------- 

;; Represented as sets of unique maps, while the maps represents the rows.
 
(def compositions
#{{:name "The Art of the Fugue" :composer "J. S. Bach" }
{:name "Musical Offering" :composer "J. S. Bach" }
{:name "Requiem" :composer "Giuseppe Verdi" }
{:name "Requiem" :composer "W. A. Mozart" }})

(def composers
#{{:composer "J. S. Bach" :country "Germany" }
{:composer "W. A. Mozart" :country "Austria" }
{:composer "Giuseppe Verdi" :country "Italy" }})

(def nations
#{{:nation "Germany" :language "German" }
{:nation "Austria" :language "German" }
{:nation "Italy" :language "Italian" }})

; *The example of the DB is taken from the book: 
;  "Programming Clojure by Stuart Halloway" page 140

;-----------------------------------------------------------------------  
; Some relational algebra
;----------------------------------------------------------------------- 
(defn alter-table-add [table-name col]
  (cons table-name col))
(alter-table-add nations {:composer "Giuseppe Verdi" :country "Italy" } )
( nations "Germany")
(defdemo demo-map-builders
  (assoc song :kind "MPEG Audio File")
  (dissoc song :genre)
  (select-keys song [:name :artist])
  (merge song {:size 8118166 :time 507245}))

;; Union two tables
(defn tables-union [table1 table2] (conj table1 table2)) 

;
(difference composers nations)

(intersection languages beverages)


(select #(= 1 (.length %)) languages)
(join compositions composers)

(print (format "%20s %20s %20s\n%20s %20s %20s"  composers))

(flatten 'nations)
un-- set


(get composers composer)
(println composer) 
(conj #{} "dadfa")
(defn #^set shout [#^string s] (conj #{} s))
(meta #' shout) 
(shout composers )

(first composer)

(conj composers compositions)
(println)

(format "%-20s %-20s %-20s\n%-20s %-20s %-20s" (eval(conj composers compositions)))




(nations :nation)
(rename compositions {:name :title})

(select #(= (:name %) "Requiem") compositions)
(project compositions [:name])



