package cz.mg.vulkan;

public class PFNvkFreeFunction extends VkFunctionPointer {
    public PFNvkFreeFunction() {
    }

    protected PFNvkFreeFunction(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkFreeFunction(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkFreeFunction(long value) {
        setValue(value);
    }

    public PFNvkFreeFunction(VkInstance instance) {
        super(instance, new VkString("vkFreeFunction"));
    }

    public void call(VkObject pUserData, VkObject pMemory){
        callNative(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, pMemory != null ? pMemory.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long pUserData, long pMemory);

}
