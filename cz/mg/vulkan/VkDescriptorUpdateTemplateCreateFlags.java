package cz.mg.vulkan;

public class VkDescriptorUpdateTemplateCreateFlags extends VkFlags {
    public VkDescriptorUpdateTemplateCreateFlags() {
    }

    public VkDescriptorUpdateTemplateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorUpdateTemplateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorUpdateTemplateCreateFlags(int value) {
        setValue(value);
    }
}
