package cz.mg.vulkan;

public class VkQueryResultFlags extends VkFlags {
    public VkQueryResultFlags() {
    }

    public VkQueryResultFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueryResultFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkQueryResultFlags(int value) {
        setValue(value);
    }
}
