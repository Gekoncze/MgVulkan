package cz.mg.vulkan;

public class VkDescriptorPoolCreateFlags extends VkFlags {
    public VkDescriptorPoolCreateFlags() {
    }

    protected VkDescriptorPoolCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorPoolCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorPoolCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkDescriptorPoolCreateFlags(int value) {
        setValue(value);
    }
}
