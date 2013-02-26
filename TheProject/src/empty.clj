(ns empty)

(def compositions  (ref 
 #{{:name "The Art of the Fugue" :composer "J. S. Bach" }
   {:name "Musical Offering" :composer "J. S. Bach" }
   {:name "Requiem" :composer "Giuseppe Verdi" }
   {:name "Requiem" :composer "W. A. Mozart" }}))

  (assoc (first @compositions ) :tata "")

  
  
(def composers (ref 
#{{:composer "J. S. Bach" :country "Germany" }
  {:composer "W. A. Mozart" :country "Austria" }
  {:composer "Giuseppe Verdi" :country "Italy" }}))

(def nations
#{{:nation "Germany" :language "German" }
  {:nation "Austria" :language "German" }
  {:nation "Italy" :language "Italian" }})




(dosync (alter nations conj {:1 5}))
(dosync (alter nations conj {:2 ""}))




(lol)
(print "cohlkj")
(eval(print (create-table 'nations))




