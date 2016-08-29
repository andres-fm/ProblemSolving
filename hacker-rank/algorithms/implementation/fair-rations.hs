import Control.Applicative
import Control.Monad
import System.IO

rations :: [Int] -> Int 
rations [x] = if x`mod`2 == 0 then 0 else -10000
rations (x:y:ys) = if x`mod`2 == 0 then 0 + rations (y:ys) else 2 + rations ((y+1):ys)

main :: IO ()
main = do
    n_temp <- getLine
    let n = read n_temp :: Int
    b_temp <- getLine
    let b = map read $ words b_temp :: [Int]
    if (rations b) < 0 then putStr "NO" else print (rations b)
