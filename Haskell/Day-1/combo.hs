let colors = ["black","white","blue","yellow","red"]
-- [(a, b) | a <- colors, b <- [x | x <- colors, a /= x], a /= b]

-- [(a, b) | a <- colors, b <- [ x | x <- (filter (/= a) colors)], a /= b]

-- [(a, b) | a <- colors, b <- [x | x <- colors2, let colors2 = filter (/= a) colors], a /= b]