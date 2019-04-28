package cz.mg.vulkan;

public class PFNvkDestroyShaderModule extends VkFunctionPointer {
    public PFNvkDestroyShaderModule() {
    }

    protected PFNvkDestroyShaderModule(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyShaderModule(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyShaderModule(long value) {
        setValue(value);
    }

    public PFNvkDestroyShaderModule(VkInstance instance) {
        super(instance, new VkString("vkDestroyShaderModule"));
    }

    public void call(VkDevice device, VkShaderModule shaderModule, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), shaderModule != null ? shaderModule.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long shaderModule, long pAllocator);



}
