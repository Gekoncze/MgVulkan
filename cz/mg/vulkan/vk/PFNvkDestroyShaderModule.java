package cz.mg.vulkan.vk;

public class PFNvkDestroyShaderModule extends VkFunctionPointer {
    public PFNvkDestroyShaderModule() {
    }

    public PFNvkDestroyShaderModule(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyShaderModule(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyShaderModule(long value) {
        setValue(value);
    }

    public PFNvkDestroyShaderModule(VkInstance instance) {
        super(instance, new VkString("vkDestroyShaderModule"));
    }

    public void call(VkDevice device, VkShaderModule shaderModule, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, shaderModule != null ? shaderModule.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long shaderModule, long pAllocator);
}
