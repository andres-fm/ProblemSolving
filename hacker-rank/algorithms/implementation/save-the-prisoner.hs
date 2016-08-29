import Data.List

savePrisoner :: [Int]-> IO ()
savePrisoner (n:m:s:[]) = if (m + s - 1) `mod` n == 0 then print n else print ((m + s - 1) `mod` n)                               

testCases :: Int -> IO ()
testCases n
    | n <= 0 = putStr ""
    | otherwise = do          
        x <- getLine 
        let arr = map read $ words x :: [Int]
        savePrisoner(arr)
        testCases(n-1)

main :: IO ()
main = do 
          tests <- getLine
          testCases (read tests :: Int)
          
       
