data class Rule(
    val name: String,
    val attrs: MutableList<Attribute>?,
    val returnAttr: MutableList<Attribute>?,
    val bodies: MutableList<Body>,
    val id: Int,
    val first: HashSet<String> = hashSetOf(),
    val follow: HashSet<String> = hashSetOf()
)