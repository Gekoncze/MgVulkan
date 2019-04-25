package cz.mg.vulkan;

public class PFNvkDestroySamplerYcbcrConversion extends VkFunctionPointer {
    public PFNvkDestroySamplerYcbcrConversion() {
    }

    public PFNvkDestroySamplerYcbcrConversion(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroySamplerYcbcrConversion(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroySamplerYcbcrConversion(long value) {
        setValue(value);
    }

    public PFNvkDestroySamplerYcbcrConversion(VkInstance instance) {
        super(instance, new VkString("vkDestroySamplerYcbcrConversion"));
    }

    public void call(VkDevice device, VkSamplerYcbcrConversion ycbcrConversion, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), ycbcrConversion != null ? ycbcrConversion.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long ycbcrConversion, long pAllocator);
}
