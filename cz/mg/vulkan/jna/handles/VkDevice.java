package cz.mg.vulkan.jna.handles;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  VkDevice_T* object
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDevice.html">khronos documentation</a>
 **/
public class VkDevice extends Structure {
    public Pointer ptr;

    public VkDevice() {
    }

    public VkDevice(VkDevice object) {
        this.ptr = object.ptr;
    }

    public VkDevice(Pointer pointer) {
        super(pointer);
    }

    public static class ByReference extends VkDevice implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(VkDevice object){
            super(object);
        }
    }

    public static class ByValue extends VkDevice implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(VkDevice object){
            super(object);
        }
    }
}
