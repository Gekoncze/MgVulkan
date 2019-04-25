package cz.mg.vulkan;

public class VkQueryPoolCreateFlags extends VkFlags {
    public VkQueryPoolCreateFlags() {
    }

    protected VkQueryPoolCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkQueryPoolCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkQueryPoolCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkQueryPoolCreateFlags(int value) {
        setValue(value);
    }
}
