package cz.mg.vulkan.jna.handles;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  VkQueue_T* object
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueue.html">khronos documentation</a>
 **/
public class VkQueue extends Structure {
    public Pointer ptr;

    public VkQueue() {
    }

    public VkQueue(VkQueue object) {
        this.ptr = object.ptr;
    }

    public VkQueue(Pointer pointer) {
        super(pointer);
    }

    public static class ByReference extends VkQueue implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(VkQueue object){
            super(object);
        }
    }

    public static class ByValue extends VkQueue implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(VkQueue object){
            super(object);
        }
    }
}
