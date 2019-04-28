package cz.mg.vulkan;

public class PFNvkCreateBufferView extends VkFunctionPointer {
    public PFNvkCreateBufferView() {
    }

    protected PFNvkCreateBufferView(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateBufferView(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateBufferView(long value) {
        setValue(value);
    }

    public PFNvkCreateBufferView(VkInstance instance) {
        super(instance, new VkString("vkCreateBufferView"));
    }

    public void call(VkDevice device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkBufferView pView, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pView != null ? pView.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pView, long rval);


    public int call(VkDevice device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkBufferView pView){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pView != null ? pView.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pView);

}
