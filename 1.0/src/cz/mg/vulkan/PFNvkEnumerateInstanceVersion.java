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

    public int call(VkUInt32 pApiVersion){
        return callNative(getValue(), pApiVersion != null ? pApiVersion.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long pApiVersion);

}
