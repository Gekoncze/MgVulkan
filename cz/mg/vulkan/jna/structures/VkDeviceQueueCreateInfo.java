package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import java.util.Arrays;
import java.util.List;
import cz.mg.vulkan.jna.flags.VkDeviceQueueCreateFlags;
import cz.mg.vulkan.jna.types.*;
import cz.mg.vulkan.jna.enums.*;


/**
 *  typedef struct VkDeviceQueueCreateInfo {
 *      VkStructureType             sType;
 *      const void*                 pNext;
 *      VkDeviceQueueCreateFlags    flags;
 *      uint32_t                    queueFamilyIndex;
 *      uint32_t                    queueCount;
 *      const float*                pQueuePriorities;
 *  } VkDeviceQueueCreateInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceQueueCreateInfo.html">khronos documentation</a>
 **/
public class VkDeviceQueueCreateInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkDeviceQueueCreateFlags flags;
    public uint32_t queueFamilyIndex;
    public uint32_t queueCount;
    public Pointer pQueuePriorities;

    public VkDeviceQueueCreateInfo() {
    }

    public VkDeviceQueueCreateInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "queueFamilyIndex",
                "queueCount",
                "pQueuePriorities"
        });
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

    public static class ByReference extends VkDeviceQueueCreateInfo implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkDeviceQueueCreateInfo implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
