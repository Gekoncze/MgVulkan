package cz.mg.vulkan;

public class VkQueryResultFlags extends VkFlags {
    public VkQueryResultFlags() {
    }

    protected VkQueryResultFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkQueryResultFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkQueryResultFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkQueryResultFlags(int value) {
        setValue(value);
    }
}
