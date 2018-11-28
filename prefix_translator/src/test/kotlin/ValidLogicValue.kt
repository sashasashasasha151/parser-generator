//class ValidLogicValue {
//    private fun getRandomExpression(): String {
//        depth: Int
//
//        if (depth == 0) {
//            return "a"
//        }
//
//        val s = StringBuilder()
//
//        val randomState = rand.nextInt(3)
//
//        when (randomState) {
//            0 -> {
//                s.append("(")
//                s.append(getRandomExpression(depth - 1))
//                s.append(") | (")
//                s.append(getRandomExpression(depth - 1))
//                s.append(")")
//            }
//            1 -> {
//                s.append("(")
//                s.append(getRandomExpression(depth - 1))
//                s.append(") ^ (")
//                s.append(getRandomExpression(depth - 1))
//                s.append(")")
//            }
//            2 -> {
//                s.append("(")
//                s.append(getRandomExpression(depth - 1))
//                s.append(") & (")
//                s.append(getRandomExpression(depth - 1))
//                s.append(")")
//            }
//            else -> {
//                s.append("! (")
//                s.append(getRandomExpression(depth - 1))
//                s.append(")")
//            }
//        }
//
//        return s.toString()
//    }
//}