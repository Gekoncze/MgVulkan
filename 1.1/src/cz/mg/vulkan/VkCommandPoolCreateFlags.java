package cz.mg.vulkan;

public class VkCommandPoolCreateFlags extends VkFlags {
    public VkCommandPoolCreateFlags() {
    }

    protected VkCommandPoolCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCommandPoolCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCommandPoolCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkCommandPoolCreateFlags(int value) {
        setValue(value);
    }
}
