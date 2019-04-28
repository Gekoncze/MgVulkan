package cz.mg.vulkan;

public class PFNvkCreateShaderModule extends VkFunctionPointer {
    public PFNvkCreateShaderModule() {
    }

    protected PFNvkCreateShaderModule(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateShaderModule(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateShaderModule(long value) {
        setValue(value);
    }

    public PFNvkCreateShaderModule(VkInstance instance) {
        super(instance, new VkString("vkCreateShaderModule"));
    }

    public void call(VkDevice device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkShaderModule pShaderModule, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pShaderModule != null ? pShaderModule.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pShaderModule, long rval);


    public int call(VkDevice device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkShaderModule pShaderModule){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pShaderModule != null ? pShaderModule.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pShaderModule);

}
