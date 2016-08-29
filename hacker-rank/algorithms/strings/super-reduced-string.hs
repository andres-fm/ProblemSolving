reduce :: String -> String
reduce [] = []
reduce [x] = [x]
reduce (x:y:ys) 
               | x == y = reduce ys
               | otherwise = (x:reduce(y:ys))
               
tillReduced :: String -> String
tillReduced received = if length(received) == length (reduced) then received else tillReduced reduced
                       where reduced = reduce received

main :: IO ()
main = do string <- getLine
          let result = tillReduced string
          if result == [] then putStr "Empty String" else putStr result
