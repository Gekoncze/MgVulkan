package cz.mg.vulkan;

public class PFNvkResetDescriptorPool extends VkFunctionPointer {
    public PFNvkResetDescriptorPool() {
    }

    protected PFNvkResetDescriptorPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkResetDescriptorPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkResetDescriptorPool(long value) {
        setValue(value);
    }

    public PFNvkResetDescriptorPool(VkInstance instance) {
        super(instance, new VkString("vkResetDescriptorPool"));
    }

    public void call(VkDevice device, VkDescriptorPool descriptorPool, VkDescriptorPoolResetFlags flags, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), descriptorPool != null ? descriptorPool.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long descriptorPool, long flags, long rval);


    public int call(VkDevice device, VkDescriptorPool descriptorPool, int flags){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), descriptorPool != null ? descriptorPool.getVkAddress() : VkPointer.getNullAddressNative(), flags);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long descriptorPool, int flags);

}
