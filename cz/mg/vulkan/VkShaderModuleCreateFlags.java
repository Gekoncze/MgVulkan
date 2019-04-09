package cz.mg.vulkan;

public class VkShaderModuleCreateFlags extends VkFlags {
    public VkShaderModuleCreateFlags() {
    }

    public VkShaderModuleCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkShaderModuleCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkShaderModuleCreateFlags(int value) {
        setValue(value);
    }
}
