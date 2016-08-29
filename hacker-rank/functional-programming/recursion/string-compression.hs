compression :: String -> Int -> String
compression [x] r = if r == 0 then [x] else (x:show(r+1))
compression (x:y:ys) r 
                    | x /= y = if r == 0 then x:compression (y:ys) 0 else (x:show(r+1)) ++ compression (y:ys) 0
                    | otherwise = compression (y:ys) (r+1)                       

main = do
        string <- getLine
        putStrLn (compression string 0)
