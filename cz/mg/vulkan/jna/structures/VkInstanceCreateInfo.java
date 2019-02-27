package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.StringArray;
import com.sun.jna.Structure;
import cz.mg.vulkan.jna.enums.VkStructureType;
import cz.mg.vulkan.jna.flags.VkInstanceCreateFlags;

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
    public VkStructureType.ByValue sType;
    public Pointer pNext;
    public VkInstanceCreateFlags.ByValue flags;
    public VkApplicationInfo.ByReference pApplicationInfo;
    public int enabledLayerCount;
    public Pointer ppEnabledLayerNames;
    public int enabledExtensionCount;
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