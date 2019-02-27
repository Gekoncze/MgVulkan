package cz.mg.vulkan.jna.handles;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  VkPhysicalDevice_T* object
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDevice.html">khronos documentation</a>
 **/
public class VkPhysicalDevice extends Structure {
    public Pointer ptr;

    public VkPhysicalDevice() {
    }

    public VkPhysicalDevice(VkPhysicalDevice object) {
        this.ptr = object.ptr;
    }

    public VkPhysicalDevice(Pointer pointer) {
        super(pointer);
    }

    public static class ByReference extends VkPhysicalDevice implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(VkPhysicalDevice object){
            super(object.ptr);
        }
    }

    public static class ByValue extends VkPhysicalDevice implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(VkPhysicalDevice object){
            super(object);
        }
    }
}
