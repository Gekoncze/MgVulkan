package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import cz.mg.vulkan.jna.enums.VkStructureType;

import java.util.Arrays;
import java.util.List;


/**
 *  typedef struct VkApplicationInfo {
 *      VkStructureType    sType;
 *      const void*        pNext;
 *      const char*        pApplicationName;
 *      uint32_t           applicationVersion;
 *      const char*        pEngineName;
 *      uint32_t           engineVersion;
 *      uint32_t           apiVersion;
 *  } VkApplicationInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkApplicationInfo.html">khronos documentation</a>
 **/
public class VkApplicationInfo extends Structure {
    public VkStructureType.ByValue sType;
    public Pointer pNext;
    public String pApplicationName;
    public int applicationVersion;
    public String pEngineName;
    public int engineVersion;
    public int apiVersion;

    public VkApplicationInfo() {
    }

    public VkApplicationInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "pApplicationName",
                "applicationVersion",
                "pEngineName",
                "engineVersion",
                "apiVersion"
        });
    }

    public static class ByReference extends VkApplicationInfo implements Structure.ByReference {}
    public static class ByValue extends VkApplicationInfo implements Structure.ByValue {}
}
