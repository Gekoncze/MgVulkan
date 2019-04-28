package cz.mg.vulkan;

public class PFNvkEnumerateInstanceVersion extends VkFunctionPointer {
    public PFNvkEnumerateInstanceVersion() {
    }

    protected PFNvkEnumerateInstanceVersion(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkEnumerateInstanceVersion(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEnumerateInstanceVersion(long value) {
        setValue(value);
    }

    public PFNvkEnumerateInstanceVersion(VkInstance instance) {
        super(instance, new VkString("vkEnumerateInstanceVersion"));
    }

    public void call(VkUInt32 pApiVersion, VkResult rval){
        callNative(getValue(), pApiVersion != null ? pApiVersion.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long pApiVersion, long rval);


    public int call(VkUInt32 pApiVersion){
        return callSimplifiedNative(getValue(), pApiVersion != null ? pApiVersion.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long pApiVersion);

}
