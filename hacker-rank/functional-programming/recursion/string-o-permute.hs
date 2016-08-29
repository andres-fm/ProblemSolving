import System.IO
import Data.List

permute :: String -> String
permute [] = []
permute (x:y:xs) = y:x:permute xs

testCases :: Int -> IO ()
testCases n
    | n <= 0 = putStr ""
    | otherwise = do          
        x <- getLine         
        putStrLn (permute x)
        testCases (n-1) 

main :: IO()
main = do
    t <- getLine
    testCases (read t :: Int)
