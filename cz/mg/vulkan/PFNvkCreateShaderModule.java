package cz.mg.vulkan;

public class PFNvkCreateShaderModule extends VkFunctionPointer {
    public PFNvkCreateShaderModule() {
    }

    public PFNvkCreateShaderModule(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateShaderModule(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateShaderModule(long value) {
        setValue(value);
    }

    public PFNvkCreateShaderModule(VkInstance instance) {
        super(instance, new VkString("vkCreateShaderModule"));
    }

    public void call(VkDevice device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkShaderModule pShaderModule, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pShaderModule != null ? pShaderModule.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pShaderModule, long rval);
}
