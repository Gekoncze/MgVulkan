package cz.mg.vulkan;

public class VkInstanceCreateFlags extends VkFlags {
    public VkInstanceCreateFlags() {
    }

    protected VkInstanceCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkInstanceCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkInstanceCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkInstanceCreateFlags(int value) {
        setValue(value);
    }
}
