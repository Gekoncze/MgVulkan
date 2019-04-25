package cz.mg.vulkan;

public class VkFenceCreateFlags extends VkFlags {
    public VkFenceCreateFlags() {
    }

    protected VkFenceCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkFenceCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFenceCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkFenceCreateFlags(int value) {
        setValue(value);
    }
}
