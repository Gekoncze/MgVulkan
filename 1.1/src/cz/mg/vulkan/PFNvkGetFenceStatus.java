package cz.mg.vulkan;

public class PFNvkGetFenceStatus extends VkFunctionPointer {
    public PFNvkGetFenceStatus() {
    }

    protected PFNvkGetFenceStatus(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetFenceStatus(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetFenceStatus(long value) {
        setValue(value);
    }

    public PFNvkGetFenceStatus(VkInstance instance) {
        super(instance, new VkString("vkGetFenceStatus"));
    }

    public void call(VkDevice device, VkFence fence, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), fence != null ? fence.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long fence, long rval);


    public int call(VkDevice device, VkFence fence){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), fence != null ? fence.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long fence);

}
