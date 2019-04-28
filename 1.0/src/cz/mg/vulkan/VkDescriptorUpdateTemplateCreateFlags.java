package cz.mg.vulkan;

public class VkDescriptorUpdateTemplateCreateFlags extends VkFlags {
    public VkDescriptorUpdateTemplateCreateFlags() {
    }

    protected VkDescriptorUpdateTemplateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorUpdateTemplateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorUpdateTemplateCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkDescriptorUpdateTemplateCreateFlags(int value) {
        setValue(value);
    }
}
