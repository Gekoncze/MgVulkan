package cz.mg.vulkan.jna.handles;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  VkDescriptorSetLayout_T* object
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorSetLayout.html">khronos documentation</a>
 **/
public class VkDescriptorSetLayout extends Structure {
    public Pointer ptr;

    public VkDescriptorSetLayout() {
    }

    public VkDescriptorSetLayout(Pointer pointer) {
        super(pointer);
    }

    public ByReference byReference(boolean write, boolean read){
        if(write) write();
        ByReference reference = new ByReference(getPointer());
        if(read) reference.read();
        return reference;
    }

    public ByValue byValue(boolean write, boolean read){
        if(write) write();
        ByValue value = new ByValue(getPointer());
        if(read) value.read();
        return value;
    }

    public static class ByReference extends VkDescriptorSetLayout implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkDescriptorSetLayout implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
