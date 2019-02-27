package cz.mg.vulkan.jna.handles;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  VkInstance_T* object
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkInstance.html">khronos documentation</a>
 **/
public class VkInstance extends Structure {
    public Pointer ptr;

    public VkInstance() {
    }

    public VkInstance(VkInstance object) {
        this.ptr = object.ptr;
    }

    public VkInstance(Pointer pointer) {
        super(pointer);
    }

    public static class ByReference extends VkInstance implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(VkInstance vkInstance) {
            super(vkInstance);
        }
    }

    public static class ByValue extends VkInstance implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(VkInstance object) {
            super(object);
        }
    }
}
