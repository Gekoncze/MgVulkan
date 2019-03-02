package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import java.util.Arrays;
import java.util.List;
import cz.mg.vulkan.jna.types.*;
import cz.mg.vulkan.jna.flags.*;
import cz.mg.vulkan.jna.enums.*;


/**
 *  typedef struct VkDeviceCreateInfo {
 *      VkStructureType                    sType;
 *      const void*                        pNext;
 *      VkDeviceCreateFlags                flags;
 *      uint32_t                           queueCreateInfoCount;
 *      const VkDeviceQueueCreateInfo*     pQueueCreateInfos;
 *      uint32_t                           enabledLayerCount;
 *      const char* const*                 ppEnabledLayerNames;
 *      uint32_t                           enabledExtensionCount;
 *      const char* const*                 ppEnabledExtensionNames;
 *      const VkPhysicalDeviceFeatures*    pEnabledFeatures;
 *  } VkDeviceCreateInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceCreateInfo.html">khronos documentation</a>
 **/
public class VkDeviceCreateInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkDeviceCreateFlags flags;
    public uint32_t queueCreateInfoCount;
    public Pointer pQueueCreateInfos;
    public uint32_t enabledLayerCount;
    public Pointer ppEnabledLayerNames;
    public uint32_t enabledExtensionCount;
    public Pointer ppEnabledExtensionNames;
    public VkPhysicalDeviceFeatures.ByReference pEnabledFeatures;

    public VkDeviceCreateInfo() {
    }

    public VkDeviceCreateInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "queueCreateInfoCount",
                "pQueueCreateInfos",
                "enabledLayerCount",
                "ppEnabledLayerNames",
                "enabledExtensionCount",
                "ppEnabledExtensionNames",
                "pEnabledFeatures"
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

    public static class ByReference extends VkDeviceCreateInfo implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkDeviceCreateInfo implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
