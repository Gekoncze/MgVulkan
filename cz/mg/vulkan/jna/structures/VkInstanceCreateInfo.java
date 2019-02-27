package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import cz.mg.vulkan.jna.enums.VkStructureType;
import cz.mg.vulkan.jna.flags.VkInstanceCreateFlags;
import cz.mg.vulkan.jna.types.uint32_t;
import java.util.Arrays;
import java.util.List;


/**
 *  typedef struct VkInstanceCreateInfo {
 *      VkStructureType             sType;
 *      const void*                 pNext;
 *      VkInstanceCreateFlags       flags;
 *      const VkApplicationInfo*    pApplicationInfo;
 *      uint32_t                    enabledLayerCount;
 *      const char* const*          ppEnabledLayerNames;
 *      uint32_t                    enabledExtensionCount;
 *      const char* const*          ppEnabledExtensionNames;
 *  } VkInstanceCreateInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkInstanceCreateInfo.html">khronos documentation</a>
 **/
public class VkInstanceCreateInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkInstanceCreateFlags flags;
    public VkApplicationInfo.ByReference pApplicationInfo;
    public uint32_t enabledLayerCount;
    public Pointer ppEnabledLayerNames;
    public uint32_t enabledExtensionCount;
    public Pointer ppEnabledExtensionNames;

    public VkInstanceCreateInfo() {
    }

    public VkInstanceCreateInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "pApplicationInfo",
                "enabledLayerCount",
                "ppEnabledLayerNames",
                "enabledExtensionCount",
                "ppEnabledExtensionNames"
        });
    }

    public static class ByReference extends VkInstanceCreateInfo implements Structure.ByReference {}
    public static class ByValue extends VkInstanceCreateInfo implements Structure.ByValue {}
}