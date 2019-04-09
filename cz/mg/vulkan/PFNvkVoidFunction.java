package cz.mg.vulkan;

public class PFNvkVoidFunction extends VkFunctionPointer {
    public PFNvkVoidFunction() {
    }

    public PFNvkVoidFunction(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkVoidFunction(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkVoidFunction(long value) {
        setValue(value);
    }

    public void call(){
        call(getValue());
    }

    private static native void call(long vkaddress);
}
