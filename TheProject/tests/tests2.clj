(ns tests2)

;-----------------------------------------------------------------------  
; Three already created tables
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
; Testing SQL operations on already created tables
;-----------------------------------------------------------------------  




;-----------------------------------------------------------------------  
; Relational algebra tests
;-----------------------------------------------------------------------  
