(ns tests2
  (:use partial_Database))

;***********************************************************************
; Already created three tables - the same as the db from test1 should output
;***********************************************************************

;; Represented as sets of unique maps, while the maps represents the rows.
 
(def compositions-made-before
#{{:name "The Art of the Fugue" :composer "J. S. Bach" }
{:name "Musical Offering" :composer "J. S. Bach" }
{:name "Requiem" :composer "Giuseppe Verdi" }
{:name "Requiem" :composer "W. A. Mozart" }})

(def composers-made-befoe
#{{:composer "J. S. Bach" :country "Germany" }
{:composer "W. A. Mozart" :country "Austria" }
{:composer "Giuseppe Verdi" :country "Italy" }})

(def nations-made-before
#{{:nation "Germany" :language "German" }
{:nation "Austria" :language "German" }
{:nation "Italy" :language "Italian" }})

; *The example of the DB is taken from the book: 
;  "Programming Clojure by Stuart Halloway" page 140

;-----------------------------------------------------------------------  
; Testing SQL operations on already created tables
;-----------------------------------------------------------------------  
(comment ;all is comment for possible work we could have done.
  
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

)
;-----------------------------------------------------------------------  
; Relational algebra tests
;-----------------------------------------------------------------------  
