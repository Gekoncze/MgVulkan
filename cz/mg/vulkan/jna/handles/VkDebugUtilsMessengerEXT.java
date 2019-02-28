package cz.mg.vulkan.jna.handles;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  VkDebugUtilsMessengerEXT_T* object
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessengerEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsMessengerEXT extends Structure {
    public Pointer ptr;

    public VkDebugUtilsMessengerEXT() {
    }

    public VkDebugUtilsMessengerEXT(VkDebugUtilsMessengerEXT object) {
        this.ptr = object.ptr;
    }

    public VkDebugUtilsMessengerEXT(Pointer pointer) {
        super(pointer);
    }

    public static class ByReference extends VkDebugUtilsMessengerEXT implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(VkDebugUtilsMessengerEXT object){
            super(object);
        }
    }

    public static class ByValue extends VkDebugUtilsMessengerEXT implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(VkDebugUtilsMessengerEXT object){
            super(object);
        }
    }
}
