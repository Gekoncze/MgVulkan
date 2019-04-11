package cz.mg.vulkan;

public class PFNvkEnumerateInstanceVersion extends VkFunctionPointer {
    public PFNvkEnumerateInstanceVersion() {
    }

    public PFNvkEnumerateInstanceVersion(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkEnumerateInstanceVersion(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkEnumerateInstanceVersion(long value) {
        setValue(value);
    }

    public PFNvkEnumerateInstanceVersion(VkInstance instance) {
        super(instance, new VkString("vkEnumerateInstanceVersion"));
    }

    public void call(VkUInt32 pApiVersion, VkResult rval){
        call(getValue(), pApiVersion != null ? pApiVersion.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long pApiVersion, long rval);
}
