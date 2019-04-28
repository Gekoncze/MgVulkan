package cz.mg.vulkan;

public class PFNvkCreateBuffer extends VkFunctionPointer {
    public PFNvkCreateBuffer() {
    }

    protected PFNvkCreateBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateBuffer(long value) {
        setValue(value);
    }

    public PFNvkCreateBuffer(VkInstance instance) {
        super(instance, new VkString("vkCreateBuffer"));
    }

    public void call(VkDevice device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkBuffer pBuffer, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pBuffer != null ? pBuffer.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pBuffer, long rval);


    public int call(VkDevice device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkBuffer pBuffer){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pBuffer != null ? pBuffer.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pBuffer);

}
