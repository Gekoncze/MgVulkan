package cz.mg.vulkan;

public class VkDeviceCreateFlags extends VkFlags {
    public VkDeviceCreateFlags() {
    }

    protected VkDeviceCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDeviceCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkDeviceCreateFlags(int value) {
        setValue(value);
    }
}
