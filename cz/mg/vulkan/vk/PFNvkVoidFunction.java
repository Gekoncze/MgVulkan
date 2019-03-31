package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkVoidFunction.html">khronos documentation</a>
 **/
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

    public PFNvkVoidFunction(VkInstance instance) {
        super(instance, new VkString("vkVoidFunction"));
    }

    public void call(){
        call(getValue());
    }

    private static native void call(long vkaddress);
}
