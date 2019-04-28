package cz.mg.vulkan;

public class PFNvkVoidFunction extends VkFunctionPointer {
    public PFNvkVoidFunction() {
    }

    protected PFNvkVoidFunction(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkVoidFunction(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkVoidFunction(long value) {
        setValue(value);
    }

    public PFNvkVoidFunction(VkInstance instance) {
        super(instance, new VkString("vkVoidFunction"));
    }

    public void call(){
        callNative(getValue());
    }

    protected static native void callNative(long vkaddress);



}
