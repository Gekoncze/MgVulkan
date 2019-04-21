package cz.mg.vulkan;

public class VkDescriptorPoolCreateFlags extends VkFlags {
    public VkDescriptorPoolCreateFlags() {
    }

    public VkDescriptorPoolCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorPoolCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDescriptorPoolCreateFlags(int value) {
        setValue(value);
    }
}
